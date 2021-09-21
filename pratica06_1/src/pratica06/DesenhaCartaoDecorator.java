package pratica06;

abstract class DesenhaCartaoDecorator extends DesenhaCartaoAbstract {
	
	protected DesenhaCartaoAbstract dCA;
	
	public DesenhaCartaoDecorator(DesenhaCartaoAbstract DCA) {
		this.dCA = DCA;
	}
}
