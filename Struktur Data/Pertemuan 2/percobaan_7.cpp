#include <iostream>
using namespace std;

#define SIZE 10

int whatIsThis(int b[], int size);

int main() {
    int total;
    int a[SIZE] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    total = whatIsThis(a, SIZE);

    cout << "\nNilai variabel total adalah " << total << endl;

    return 0;
}

int whatIsThis(int b[], int size) {
    if (size == 1)
        return b[0];
    else
        return b[size - 1] + whatIsThis(b, size - 1);
}
