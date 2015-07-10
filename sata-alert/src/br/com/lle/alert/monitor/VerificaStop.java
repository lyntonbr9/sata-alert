package br.com.lle.alert.monitor;

import java.math.BigDecimal;
import java.util.List;

import br.com.lle.alert.domain.AvisoStop;
import br.com.lle.alert.domain.StopAtivo;
import br.com.lle.sata.mobile.core.interfaces.IBuscaCotacao;
import br.com.lle.sata.mobile.core.robo.BVMFBuscaCotacao;

public class VerificaStop 
{
	
	public void verificarNotificacao(AvisoStop as) {
		IBuscaCotacao bs = new BVMFBuscaCotacao();
		for (StopAtivo sa : as.getStopsAtivo()) {
			if (sa.isHabilitado()) {
				String strCotacao = bs.getCotacao(sa.getCodigoAtivo()).replaceAll(",",".");
				System.out.println("\nCOTACAO " + sa.getCodigoAtivo() + ": " + strCotacao);
				BigDecimal cotacao = new BigDecimal(strCotacao);
				// se a cotacao estiver menor do que o preco de disparo
				if (cotacao.compareTo(sa.getMinDisparo().getPreco()) == -1 
								&& sa.getMinDisparo().getQtdNotificacoes() < StopAtivo.MAX_NUM_NOTIFIC) {
					// cria o alerta
					String msg = sa.getCodigoAtivo() + " SL: " + sa.getMinDisparo().getPreco() + " PR: " + cotacao;
					System.out.println("Alerta " + msg);
					sa.getMinDisparo().setNotificar(true);
					sa.getMinDisparo().setMensagem(msg);
					sa.getMinDisparo().setQtdNotificacoes(sa.getMinDisparo().getQtdNotificacoes() + 1);
				}
				if (cotacao.compareTo(sa.getMaxDisparo().getPreco()) >= 0 
								&& sa.getMaxDisparo().getQtdNotificacoes() < StopAtivo.MAX_NUM_NOTIFIC) {
					// cria o alerta
					String msg = sa.getCodigoAtivo() + " SH: " + sa.getMaxDisparo().getPreco() + " PR: " + cotacao;
					System.out.println("Alerta " + msg);
					sa.getMaxDisparo().setNotificar(true);
					sa.getMaxDisparo().setMensagem(msg);
					sa.getMaxDisparo().setQtdNotificacoes(sa.getMaxDisparo().getQtdNotificacoes() + 1);
				}
			} else {
				sa.getMinDisparo().setNotificar(false);
				sa.getMaxDisparo().setNotificar(false);
			}
		}
	}
	
	public void verificarNotificacao(List<AvisoStop> ass) {
		for(AvisoStop as : ass) {
			verificarNotificacao(as);
		}
	}
 
}
