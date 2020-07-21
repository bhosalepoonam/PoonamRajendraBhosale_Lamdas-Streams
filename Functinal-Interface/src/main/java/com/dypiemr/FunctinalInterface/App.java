package com.dypiemr.FunctinalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 List<String> list= Arrays.asList("ale","mango","app","anoth","aaa","php");
    	 List<Integer> nums=Arrays.asList(11,10,5,4);
    	 search(list);
    	 Double res=CalculateAvg(nums);
    	
    	 System.out.println("Average is:"+res);
    }
    
    public static void search(List<String> nums)
    {
    	nums.stream()
   	 .filter(s ->s.startsWith("a") && s.length()==3)
   	 .forEach(System.out::println);
    }
    public static double CalculateAvg(List<Integer> li)
    {
    	return li.stream().mapToDouble(a->a).average().getAsDouble();
    }
  
}
