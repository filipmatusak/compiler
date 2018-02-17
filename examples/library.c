#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>
#include <stdbool.h>


int readInt() {
    int r;
    scanf("%d", &r);
    return r;
}

char readChar() {
    char c;
    scanf("%c", &c);
    return c;
}

double readFloat() {
    double d;
    scanf("%lf", &d);
    return d;
}

char* readString() {
    char* s = (char*) malloc((1024)*sizeof(char));
    scanf("%s", s);
    return s;
}

int *readarray(int n) {
    int *r = malloc(n * sizeof(int));
    int i;
    for (i=0; i<n; i++) {
        scanf("%d", &r[i]);
    }
    return r;
}

int printi(int* x){
    printf("%d", *x);
    return 0;
}

int printiln(int* x){
    printf("%d\n", *x);
    return 0;
}

int printc(char* x){
    printf("%c", *x);
    return 0;
}

int printcln(char* x){
    printf("%c\n", *x);
    return 0;
}

int prints(char** x){
    printf("%s", *x);
    return 0;
}

int printsln(char** x){
    printf("%s\n", *x);
    return 0;
}

int printd(double* x){
    printf("%f", *x);
    return 0;
}

int printdln(double* x){
    printf("%f\n", *x);
    return 0;
}

int printb(bool* x){
    printf("%s", *x%2 ? "true" : "false");
    return 0;
}

int printbln(bool* x){
    printf("%s\n", *x%2 ? "true" : "false");
    return 0;
}

long* allocArray(int* dimension, ...) {
    va_list valist;
    va_start(valist, *dimension);
    int size = 1;
    int dims[*dimension];
    for(int i = 0; i < *dimension; i++){
        dims[i] = *va_arg(valist, int*);
        size *= dims[i];
    }
    va_end(valist);
    long * array = (long *)malloc(sizeof(long)*(size + 1 + *dimension));
    array[0] = *dimension;
    for(int i = 0; i < *dimension; i++){
        array[i+1] = dims[i];
    }
    return array;
}

int* getIntArrayPointer(long** array, int* d1, ...){
    long dimension = array[0][0];
    long pos = 0, acc = 1;
    int pointers[dimension];
    pointers[0] = *d1;
    va_list valist;
    va_start(valist, d1);
    for(int i = 1; i < dimension; i++){
        pointers[i] = *va_arg(valist, int*);
    }
    for(int i = dimension - 1; i >= 0; i--){
        pos += acc*pointers[i];
        acc *= array[0][1+i];
    }
    return (int*)(array[0] + 1 + dimension + pos);
}

char* getCharArrayPointer(long** array, int* d1, ...){
    long dimension = array[0][0];
    long pos = 0, acc = 1;
    int pointers[dimension];
    pointers[0] = *d1;
    va_list valist;
    va_start(valist, d1);
    for(int i = 1; i < dimension; i++){
        pointers[i] = *va_arg(valist, int*);
    }
    for(int i = dimension - 1; i >= 0; i--){
        pos += acc*pointers[i];
        acc *= array[0][1+i];
    }
    return (char*)(array[0] + 1 + dimension + pos);
}

bool* getBoolArrayPointer(long** array, int* d1, ...){
    long dimension = array[0][0];
    long pos = 0, acc = 1;
    int pointers[dimension];
    pointers[0] = *d1;
    va_list valist;
    va_start(valist, d1);
    for(int i = 1; i < dimension; i++){
        pointers[i] = *va_arg(valist, int*);
    }
    for(int i = dimension - 1; i >= 0; i--){
        pos += acc*pointers[i];
        acc *= array[0][1+i];
    }
    return (bool*)(array[0] + 1 + dimension + pos);
}

char** getStringArrayPointer(long** array, int* d1, ...){
    long dimension = array[0][0];
    long pos = 0, acc = 1;
    int pointers[dimension];
    pointers[0] = *d1;
    va_list valist;
    va_start(valist, d1);
    for(int i = 1; i < dimension; i++){
        pointers[i] = *va_arg(valist, int*);
    }
    for(int i = dimension - 1; i >= 0; i--){
        pos += acc*pointers[i];
        acc *= array[0][1+i];
    }
    return (char**)(array[0] + 1 + dimension + pos);
}

double* getDoubleArrayPointer(long** array, int* d1, ...){
    long dimension = array[0][0];
    long pos = 0, acc = 1;
    int pointers[dimension];
    pointers[0] = *d1;
    va_list valist;
    va_start(valist, d1);
    for(int i = 1; i < dimension; i++){
        pointers[i] = *va_arg(valist, int*);
    }
    for(int i = dimension - 1; i >= 0; i--){
        pos += acc*pointers[i];
        acc *= array[0][1+i];
    }
    long *start = array[0] + 1 + dimension + pos;
    double* res = (double*)(array[0] + 1 + dimension + pos);
    return res;
}
