package Assignment7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImpl {
	public static void main(String[] args) {
		List<String> strObj=Stream.of("","gjf","abc","","jkg","retre","Bangalore","yrytio","")
				.collect(Collectors.toList());
		long countLength = strObj.stream().filter(x -> x.length()> 5).count();
		System.out.println(countLength);
		long countEmpty = strObj.stream() .filter(x -> x.isEmpty()) .count();
		System.out.println(countEmpty);
		List<String> emptyString=(strObj.stream() .filter(x -> x.isEmpty()))
				.collect(Collectors.toList());
		emptyString.forEach((x)->System.out.println(x+".")); //testing storage of empty string
	}
}
