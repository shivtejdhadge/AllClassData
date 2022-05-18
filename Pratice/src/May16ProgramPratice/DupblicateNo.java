package May16ProgramPratice;

public class DupblicateNo {


public static void main(String[]args){

int a[]=new int [4];

a[0]=12;
a[1]=23;
a[2]=20;
a[3]=12;
int temp=0;


for(int i=0;i<a.length;i++){
  for(int j=i+1;j<a.length;j++){

	if(a[i]==a[j]){
	temp=a[i];
	System.out.println(temp);
	}

}
}
}

}
