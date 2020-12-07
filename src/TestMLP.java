import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestMLP {

	public static void main(String[] args) throws Exception {
		
		try {
		MLP mlp = new MLP();
		double [] y = {1,1,0};
		double [][] X = {
			{0.1765,0.1613,0.3401,0.0843},
			{0.317,0.5786,0.3387,0.4192},
			{0.2467,0.0337,0.2699,0.3454},
			{0.6102,0.8192,0.4679,0.4762},
			{0.703,0.7784,0.7482,0.6562},
			{0.4767,0.4348,0.4852,0.364},
			{0.7589,0.8256,0.6514,0.6143},
			{0.1579,0.3641,0.2551,0.2919},
			{0.5561,0.5602,0.5605,0.2105},
			{0.3267,0.2974,0.0343,0.1466},
			{0.2303,0.0942,0.3889,0.1713},
			{0.2953,0.2963,0.26,0.3039},
			{0.5797,0.4789,0.578,0.3048},
			{0.586,0.525,0.4792,0.4021},
			{0.7045,0.6933,0.6449,0.6623},
			{0.9134,0.9412,0.6078,0.5934},
			{0.2333,0.4943,0.2525,0.2567},
			{0.2676,0.4172,0.2775,0.2721},
			{0.485,0.5506,0.5269,0.6036},
			{0.2434,0.2567,0.2312,0.2624},
			{0.125,0.3023,0.1826,0.3168},
			{0.5598,0.4253,0.4258,0.3192},
			{0.5738,0.7674,0.6154,0.4447},
			{0.5692,0.8368,0.5832,0.4585},
			{0.4655,0.7682,0.3221,0.294},
			{0.5568,0.7592,0.6293,0.5453},
			{0.8842,0.7509,0.5723,0.5814},
			{0.7959,0.9243,0.7339,0.7334},
			{0.7124,0.7128,0.6065,0.6668},
			{0.6749,0.8767,0.6543,0.7461},
			{0.3674,0.4359,0.423,0.2965},
			{0.3473,0.0754,0.2183,0.1905},
			{0.6931,0.5188,0.5386,0.5794},
			{0.6439,0.4959,0.4322,0.4582},
			{0.5627,0.4893,0.6831,0.512},
			{0.5182,0.7553,0.6368,0.4538},
			{0.6046,0.7479,0.6542,0.4375},
			{0.6328,0.6786,0.7751,0.6183},
			{0.3429,0.4694,0.2855,0.2977},
			{0.6371,0.5069,0.5316,0.452},
			{0.6388,0.697,0.6407,0.7677},
			{0.3529,0.5504,0.3706,0.4828},
			{0.4302,0.3237,0.6397,0.4319},
			{0.7078,0.9604,0.747,0.6399},
			{0.735,0.817,0.7227,0.6279},
			{0.7011,0.2946,0.6625,0.4312},
			{0.5961,0.3817,0.6363,0.3663},
			{0,0.2563,0.2603,0.3027},
			{0.5996,0.5704,0.6965,0.6548},
			{0.4289,0.3709,0.3994,0.3656},
			{0.2093,0.3655,0.3334,0.1802},
			{0.2335,0.2856,0.3912,0.1601},
			{0.3266,0.7751,0.4356,0.3448},
			{0.2457,0.1203,0.1228,0.2206},
			{0.4656,0.4815,0.4211,0.4862},
			{0.7511,0.8868,0.5408,0.6253},
			{0.7825,0.9386,0.651,0.6996},
			{0.3463,0.4118,0.2507,0.0454},
			{0.5172,0.1482,0.3172,0.2323},
			{0.6942,0.4516,0.5387,0.5983},
			{0.7586,0.7017,0.712,0.7509},
			{0.688,0.6004,0.6602,0.432},
			{0.4742,0.5079,0.4135,0.4161},
			{0.4419,0.5761,0.4515,0.4497},
			{0.3367,0.4333,0.2336,0.1678},
			{0.4744,0.4604,0.1507,0.4873},
			{0.751,0.435,0.5453,0.4831},
			{0.4045,0.5636,0.2534,0.5573},
			{0.1449,0.1539,0.2446,0.0559},
			{0.346,0.2722,0.1866,0.5049},
			{0.2241,0.2046,0.3575,0.2891},
			{0.1412,0.2264,0.4025,0.2661},
			{0.5782,0.6418,0.7212,0.6396},
			{0.9153,0.6571,0.8229,0.6689},
			{0.6014,0.7664,0.6385,0.5513},
			{0.7328,0.8708,0.8812,0.706},
			{0.427,0.6352,0.6811,0.3884},
			{0.6189,0.1652,0.4016,0.3042},
			{0.2143,0.3868,0.1926,0},
			{0.5696,0.7238,0.7199,0.6677},
			{0.8656,0.67,0.657,0.6065},
			{0.9002,0.6858,0.7409,0.7047},
			{0.4167,0.5255,0.5506,0.4093},
			{0.8325,0.4804,0.799,0.7471},
			{0.4124,0.1191,0.472,0.3184},
			{1,1,0.7924,0.7074},
			{0.5685,0.6924,0.618,0.5792},
			{0.6505,0.4864,0.2972,0.4599},
			{0.8124,0.769,0.972,1},
			{0.9013,0.716,1,0.8046},
			{0.8872,0.7556,0.9307,0.6791},
			{0.3708,0.2139,0.2136,0.4295},
			{0.5159,0.4349,0.3715,0.4086},
			{0.6768,0.6304,0.8044,0.4885},
			{0.1664,0.2404,0.2,0.3425},
			{0.2495,0.2807,0.4679,0.22},
			{0.2487,0.2348,0.0913,0.1281},
			{0.5748,0.8552,0.5973,0.7317},
			{0.3858,0.7585,0.3239,0.3565},
			{0.3329,0.4946,0.5614,0.3152},
			{0.3891,0.4805,0.7598,0.4231},
			{0.2888,0.4888,0.193,0.0177},
			{0.3827,0.49,0.2272,0.3599},
			{0.6047,0.4224,0.6274,0.5809},
			{0.984,0.7031,0.6469,0.4701},
			{0.6554,0.6785,0.9279,0.7723},
			{0.0466,0.3388,0.084,0.0762},
			{0.6154,0.8196,0.6339,0.7729},
			{0.8452,0.8897,0.8383,0.6961},
			{0.6927,0.787,0.7689,0.7213},
			{0.4032,0.6188,0.493,0.538},
			{0.4006,0.3094,0.3868,0.0811},
			{0.7416,0.7138,0.6823,0.6067},
			{0.7404,0.6764,0.8293,0.4694},
			{0.7736,0.7097,0.6826,0.8142},
			{0.5823,0.9635,0.3706,0.5636},
			{0.2081,0.3738,0.3119,0.3552},
			{0.5616,0.8972,0.5186,0.665},
			{0.6594,0.8907,0.6,0.7157},
			{0.3979,0.307,0.3637,0.122},
			{0.2644,0,0.3572,0.1931},
			{0.4816,0.4791,0.4213,0.5889},
			{0.0848,0.0749,0.4349,0.3328},
			{0.4608,0.6775,0.3533,0.3016},
			{0.4155,0.6589,0.531,0.5404},
			{0.3934,0.6244,0.4817,0.4324},
			{0.5843,0.8517,0.8576,0.7133},
			{0.1995,0.369,0.3537,0.3462},
			{0.3832,0.2321,0.0341,0.245}
		};
		
		mlp.learningRate = 0.1;
		
		mlp.iterations = 140;
		mlp.treinar(X,y);
		double [][] teste = X;
		double [] escolhido = new double[3];
//			System.out.println("y1");
			for(int i=1;i<4;i++) {
				mlp.forwardPropagation(teste[i]);
				double valor = new BigDecimal(mlp.outputValue).setScale(6, RoundingMode.HALF_EVEN).doubleValue();
				escolhido[i-1] = valor; 
				System.out.println("Tipo " + i 
						+ " calculado: " + Math.round(mlp.outputValue) 
						+ " calculado integer: " + valor
						);
				
			}
			double maior = 0.0;
			int indiceMaior =0;
			for (int i = 0; i < escolhido.length; i++) {
			    if (escolhido[i] >= maior) {
			        maior = escolhido[i];
			        indiceMaior = i;
			    }
			}
		 System.out.println("Vencedor: tipo "+ (indiceMaior+1) +" | valor: "+maior);
		} catch (Exception e) {
            System.out.println("Erro::: " + e.getMessage());
        }
	}
}