.bytecode 49.0
.class public must4
.super java/lang/Object


.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99

ldc 4
istore 8
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokenonvirtual java/util/Scanner/<init>(Ljava/io/InputStream;)V
astore 2
ldc "Wrong answer"
astore 4
aload 2
invokevirtual java/util/Scanner.nextInt()I
istore 7
start0:
iload 7
iload 8
if_icmpne isTrue0
isFalse0:
iconst_0
goto end0
isTrue0:
iconst_1
end0:
ifeq end2
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 8
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
aload 2
invokevirtual java/util/Scanner.nextInt()I
istore 7
goto start0
end2:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Correct answer"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return
.end method

