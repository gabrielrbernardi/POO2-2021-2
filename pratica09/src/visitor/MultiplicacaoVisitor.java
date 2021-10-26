package visitor;

import java.util.List;

public class MultiplicacaoVisitor implements NumberVisitor{

	@Override
	public void visit(TwoElement twoElement) {
		int soma = twoElement.a * twoElement.b;
		System.out.printf(twoElement.a + " + " + twoElement.b + " = " + soma);
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int soma = threeElement.a * threeElement.b * threeElement.c;
		System.out.printf(threeElement.a + " * " + threeElement.b + " * " + threeElement.c + " = " + soma);
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement NE : elementList) ///iterando na lista de elementos passada como parametro
		{
			NE.accept(this);
		}
	}
}
