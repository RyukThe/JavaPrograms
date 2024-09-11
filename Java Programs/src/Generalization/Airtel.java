package Generalization;

public class Airtel implements Simcard
{
	public void AudioCalling() 
	{
		System.out.println("Audiocalling:600min");
	}
	public void SMS() 
	{
		System.out.println("SMS:300");
	}
	public void Data() 
	{
		System.out.println("data:3GB");
	}
	public void NewfeatureC()
	{
		System.out.println("new feature :C");
	}
}
