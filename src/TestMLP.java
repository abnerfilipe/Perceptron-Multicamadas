
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMLP {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		double[][] X = new double[130][4];
		try {
			
            FileReader fr = new FileReader("./src/data.json");
            BufferedReader br = new BufferedReader(fr);
            
            StringBuilder sb = new StringBuilder();
            String line;
            ObjectMapper oMapper = new ObjectMapper();
            while ((line = br.readLine()) != null) {
            	sb = sb.append(line);
            }
            var ja = new JSONArray(sb.toString());
            ja.forEach((item) -> {
        		try {
//					Map<String, Object> map = oMapper.readValue(item.toString(), Map.class);
//					for(int i=0; i < map.size())
					System.out.println(map.size());
        		} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
            });           
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Erro::: " + e.getMessage());
        }
		
		
		MLP mlp = new MLP();
		
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