.bytecode 49.0
.class public must2
.super java/lang/Object


.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 1
aload 1
invokevirtual java/util/Scanner.nextInt()I
istore 2
iload 2
ldc 5
if_icmpgt isTrue0
isFalse0:
iconst_0
goto end0
isTrue0:
iconst_1
end0:
istore 4
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 4
invokevirtual java/io/PrintStream/println(I)V
return
.end method

