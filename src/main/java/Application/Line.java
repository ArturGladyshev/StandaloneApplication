package Application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Line
{
		@Value("${targetLine}")
		private String targetLine;

		public Line()
		{
		}

		public Line(String targetLine)
		{
				super();
				this.targetLine = targetLine;
		}

		public String getLine()
		{
				return targetLine;
		}

		public void setLine(String targetLine)
		{
				this.targetLine = targetLine;
		}
}

