#include<stdio.h>
#include<stdlib.h>
struct student
{
    char name[50];
    int age;
    int roll;
};
int main()
{
    int n=10,i;
    struct student a[n],s;
    FILE *fp;
    fp=fopen("data.txt","w");
    if(fp==NULL)
    {
        printf("File not Opened\n");
        exit(0);
    }
    printf("Enter Name, age, Roll no of students : \n");
    for(i=0;i<n;i++)
    {
        scanf("%s %d %d",a[i].name,&a[i].age,&a[i].roll);
        fwrite(&a[i],sizeof(a[i]),1,fp);
    }
    fclose(fp);
    fp=fopen("data.txt","r");
    if(fp==NULL)
    {
        printf("File not Opened\n");
        exit(0);
    }
    for(i=0;i<n;i++)
    {
        fread(&s,sizeof(s),1,fp);
        printf("%s %d %d\n",s.name,s.age,s.roll);
    }
    fclose(fp);
    return 0;
}