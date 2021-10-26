package visitor;

import java.util.List;

public class TotalMultiplicacaoVisitor implements NumberVisitor{
	int total=0;
	@Override
	public void visit(TwoElement twoElement) {
		int soma = twoElement.a * twoElement.b;
		System.out.printf(twoElement.a + " + " + twoElement.b + " = " + soma);
		total+=soma;
	}

	@Override
	public void visit(ThreeElement threeElement) {
		int soma = threeElement.a * threeElement.b * threeElement.c;
		System.out.printf(threeElement.a + " * " + threeElement.b + " * " + threeElement.c + " = " + soma);
		total+=soma;
	}

	@Override
	public void visit(List<NumberElement> elementList) {
		for (NumberElement NE : elementList) ///Iterando sobre a lista de elementos passada como parametro 
		{
			NE.accept(this);
		}
	}
	
	public int getTotalMul()
	{
		return total;
	}
}
