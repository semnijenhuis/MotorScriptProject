.bytecode 49.0
.class public must
.super java/lang/Object


.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 3
ldc 5
ldc 6
imul
ldc 5
ldc 2
imul
idiv
iadd
ldc 6
isub
istore 3
iload 3
ldc 10
iadd
istore 3
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream/println(I)V
return
.end method

