
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;

public class TestMLP {

	public static void main(String[] args) throws Exception {
		MLP mlp = new MLP();
		double [][] X = {
				{1,0,1,0},
				{0,1,0,1},
				{1,1,1,1},
				{0,0,0,0}
		};
		double [] y = {1,1,0};
		
		mlp.learningRate = 0.1;
		
		mlp.iterations = 2000;
		mlp.printAll();
		mlp.treinar(X,y);
//		matriz treino 
//		double [][] teste = {{0,1},{0,0},{1,0},{1,1}};
		double [][] teste = X;

//		esperado
//		double [] real = {1,0,1,0};
		System.out.println("y1");
		for(int i=0;i<3;i++) {
			mlp.forwardPropagation(teste[i]);
			System.out.println("Tipo " + i 
//					+ " previsto: " + real[i]
					+ " calculado: " + Math.round(mlp.outputValue) 
					+ " calculado integer: " + new BigDecimal(mlp.outputValue).setScale(7, RoundingMode.HALF_EVEN).doubleValue()
					);
		}
	}
}