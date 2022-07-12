package Utils;

public class ReverseLineUtil
{
		public static String reverseLine(String line)
		{
				return new StringBuilder(line).reverse().toString();
		}

		public static long calculateTimeOfLineFlips(String line, int iterations)
		{
				long startTime = System.nanoTime();
				for(int i = 0; i < iterations; ++i)
						reverseLine(line);
				long endTime = System.nanoTime();
				return endTime - startTime;
		}
}
