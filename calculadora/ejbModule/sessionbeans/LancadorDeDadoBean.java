package sessionbeans;

import java.util.Random;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(LancadorDeDadoBean.class)
public class LancadorDeDadoBean implements LancadorDeDado {
	private Random gerador = new Random();

	@Override
	public int lanca() {
		return this.gerador.nextInt(5) + 1;
	}
}
