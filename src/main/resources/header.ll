
declare i32 @printi(i32*)
declare i32 @printiln(i32*)
declare i32 @printc(i8*)
declare i32 @printcln(i8*)
declare i32 @prints(i8**)
declare i32 @printsln(i8**)
declare i32 @printd(double*)
declare i32 @printdln(double*)
declare i32 @printb(i1*)
declare i32 @printbln(i1*)
declare i32 @readInt()
declare i8 @readChar()
declare i8* @readString()
declare double @readFloat()
declare i32 @strcmp(i8*, i8*)
declare i64* @allocArray(i32*, ...)
declare i32* @getIntArrayPointer(i64**, i32*, ...)
declare double* @getDoubleArrayPointer(i64**, i32*, ...)
declare i8* @getCharArrayPointer(i64**, i32*, ...)
declare i1* @getBoolArrayPointer(i64**, i32*, ...)
declare i8** @getStringArrayPointer(i64**, i32*, ...)

