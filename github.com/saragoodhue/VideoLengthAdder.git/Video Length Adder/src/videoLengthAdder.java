import java.util.Scanner;

public class videoLengthAdder
	{

		public static void main(String[] args)
			{
				System.out.println("How many hours is video 1?");
				Scanner videoLength = new Scanner(System.in);
				int videoOneHours = videoLength.nextInt();

				System.out.println("How many minutes is video 1?");
				int videoOneMinutes = videoLength.nextInt();

				System.out.println("How many seconds is video 1?");
				int videoOneSeconds = videoLength.nextInt();

				System.out.println("How many hours is video 2?");
				int videoTwoHour = videoLength.nextInt();

				System.out.println("How many minutes is video 2?");
				int videoTwoMinutes = videoLength.nextInt();

				System.out.println("How many seconds is video 2?");
				int videoTwoSeconds = videoLength.nextInt();

				int videoHours = videoOneHours + videoTwoHour;
				int videoMinutes = videoOneMinutes + videoTwoMinutes;
				int videoSeconds = videoOneSeconds + videoTwoSeconds;

				if (videoMinutes >= 60)
					{
						videoMinutes = videoMinutes % 60;
						videoHours++;

					}

				if (videoSeconds >= 60)
					{
						videoSeconds = videoSeconds % 60;
						videoMinutes++;
					}

				System.out.println("The combined duration of the two videos is " + videoHours + ":" + videoMinutes + ":"
						+ videoSeconds);
			}

	}
