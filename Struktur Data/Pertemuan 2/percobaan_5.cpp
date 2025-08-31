#include <iostream>
using namespace std;

double get_avg(int a[], int n){
    long long sum = 0;
    for(int i=0;i<n;i++) sum += a[i];
    return n ? (double)sum / n : 0.0;
}

int search_data(int a[], int n, int key){
    for(int i=0;i<n;i++) if(a[i]==key) return i;
    return -1;
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
    cout << "Rata-rata: " << get_avg(a,n) << "\n";
    int key; cout << "Cari nilai: "; cin >> key;
    int pos = search_data(a,n,key);
    if(pos != -1) cout << "Ketemu di indeks: " << pos << "\n";
    else cout << "Tidak ditemukan\n";
    return 0;
}
