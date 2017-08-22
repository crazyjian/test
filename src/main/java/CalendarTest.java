import java.util.Scanner;


public class CalendarTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
		System.out.println("请输入月份：");
		int month = input.nextInt();
		
		String [] arr = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		System.out.println("\t\t\t"+arr[month-1]+"  "+year+"\n--------------------------------------------------");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//计算本月1日距离1900年1月1日的天数
		int sum = 0;
		for(int i=1900; i<year; i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				sum += 366;
			}else {
				sum += 365;
			}
		}
		for(int i=1; i<month; i++) {
			if(i==2) {
				if((year%4==0 && year%100!=0) || year%400==0) {
					sum += 29;
				}else {
					sum += 28;
				}
			}else {
				if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sum = sum + 30;
                } else {
                    sum = sum + 31;
                }
			}
		}
		System.out.println("距离1900-01-01相差："+sum+"天");
		sum++;
		int weekday = sum % 7;
		for(int i=1;i<=weekday;i++) {
			System.out.print("\t");
		}
		//计算本月天数
		int k=0;
		if(month==2) {
			if((year%4==0 && year%100!=0) || year%400==0) {
				k = 29;
			}else {
				k = 28;
			}
		}else {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
                k = 30;
            } else {
                k = 31;
            }
		}
		for(int i=1;i<=k;i++) {
			if(sum % 7 == 6)
				System.out.print(i+"\n");
			else
				System.out.print(i+"\t");
			sum++;
		}
    }
}
