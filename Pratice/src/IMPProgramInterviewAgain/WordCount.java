package IMPProgramInterviewAgain;

public class WordCount {

public static void main(String[]args){

String s="Shivtej Tukaram Dhadge";
 char[] ar=s.toCharArray();
 int count=0;
for(char name:ar){
switch(name){

	case 's':
	case 'i':
	case 'a':
	count++;
	break;
}
}
System.out.println("Name==>"+count);
}
}
