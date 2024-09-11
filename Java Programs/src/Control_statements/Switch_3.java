package Control_statements;

public class Switch_3 
{
	public static void main(String[] args)
	{
		switch("CW")
		{
		case "CD":System.out.println("Cash Deposite");
		break;
		
		case "CW":System.out.println("Cash withdrawal");
		break;
		
		case "BI":System.out.println("Balance Inquiry");
		break;
		
		case "MS":System.out.println("Mini statement");
		break;
		
		default:System.out.println("wrong Input");
		
		}
	}
}
