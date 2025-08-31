#include <iostream>
using namespace std;

int get_max(int a[], int n){
    int imax = 0;
    for (int i = 1; i < n; i++)
        if (a[i] > a[imax]) imax = i;
    return a[imax];
}

int get_min(int a[], int n){
    int imin = 0;
    for (int i = 1; i < n; i++)
        if (a[i] < a[imin]) imin = i;
    return a[imin];
}

int main(){
    int a[20], n;
    cout << "Masukkan jumlah data (1..20): ";
    cin >> n;
    if(n < 1 || n > 20){ cout << "Jumlah tidak valid\n"; return 0; }
    for(int i=0;i<n;i++){
        cout << "Data[" << i << "]: ";
        cin >> a[i];
    }
    cout << "Maksimum: " << get_max(a,n) << "\n";
    cout << "Minimum: " << get_min(a,n) << "\n";
    return 0;
}
