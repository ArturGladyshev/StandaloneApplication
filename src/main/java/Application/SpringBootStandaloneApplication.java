package Application;

import Utils.ReverseLineUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStandaloneApplication implements CommandLineRunner
{
		@Autowired
		@Qualifier("line")
		Line lineBean;

		public static void main(String[] args)
		{
				SpringApplication.run(SpringBootStandaloneApplication.class, args);
		}

		public void run(String... arg0) throws Exception
		{
				System.out.println((ReverseLineUtil.reverseLine(lineBean.getLine())));
				System.out.println(ReverseLineUtil.calculateTimeOfLineFlips(lineBean.getLine(), 1000));
				System.out.println(ReverseLineUtil.calculateTimeOfLineFlips(lineBean.getLine(), 10000));
				System.out.println(ReverseLineUtil.calculateTimeOfLineFlips(lineBean.getLine(), 100000));
		}
}
