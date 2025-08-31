#include <iostream>
using namespace std;

int main() {
    int array[10];  
   
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    array[4] = 50;

    cout << "Isi elemen array: ";
    for (int i = 0; i < 10; i++) {
        cout << array[i] << " ";
    }
    cout << endl;

    return 0;
}
