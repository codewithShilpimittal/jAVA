#include<stdio.h>
int main()
{
int arr[2][3];
int i,j;
printf("enter aray elemts of matrix (%dx%d) row-wise :\n",2,3);
for(i=0;i<2;i++)
 {
  for(j=0;j<3;j++)
   {
     scanf("%d\n",arr[i][j]);
   }
 }
for(i=0;i<2;i++)
 {
  for(j=0;j<3;j++)
   {
     printf("%d\n",arr[i][j]);
   }
 }
}
getch();
