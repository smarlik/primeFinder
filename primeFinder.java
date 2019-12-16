int[]CreateSieve(int x) {
	int[] a;
	a=new int[x];
	for(int c=1;c<a.length;c=c+1) {
		a[c]=c+1;
		}
	return a;
}

void crossout(int[] a,int n) {
	for(int c=0;c<a.length;c=c+1) {
		if(n<a[c]) {
			if (a[c]%n==0) {
				a[c]=0;
			}
		}
	}
}

void printSieve(int[] a) {
	for(int c=0;c<a.length;c=c+1) {
		if(a[c]==0) {
			continue;
		}
		if(c!=1) {
			printf(",");
		}
		printf(""+a[c]);
	}
}

printf("\n This is my STEM fair progect.");
printf("\n This program will find all\n prime numbers ");
printf("between zero \n and the number that you give.");
printf("\n Prime numbers are numbers that you can only\n divide by one and itself.");
printf("\n This program uses Sieve of Eratosthens algoritam\n for finding prime numbers");
printf("\n\n Please enter a number: ");
int x =readInt();
int[] sieve=CreateSieve(x);
printf("\n "); 
for(int n=2;n<x;n=n+1) {
	crossout(sieve,n);
	}

printSieve(sieve);
printf("\n\n\n\n Press enter to exit");
read();