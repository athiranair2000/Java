import java.text.*;
import java.util.*;
public class LocaliseCurrency{
	public static void main(String[] args){
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted=nft.format(10000);
		System.out.println(formatted);
	}
}
