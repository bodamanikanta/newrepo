#include <cstdio>
#include <iostream>


using namespace std;

int main()
{
    int age;
    cin >> age;
    if(age<=10)
    {
        cout << "Kid";
    }
    else if (age <= 18)
    {
        cout << "Teenager";
    }
    else if (age <= 60)
    {
        cout << "Adult";
    }
    else
    {
        cout << "Dead";
    }
    return 0;
    
}