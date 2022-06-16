.bytecode 49.0
.class public must3
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
istore 10
aload 1
invokevirtual java/util/Scanner.nextInt()I
istore 12
iload 10
iload 12
if_icmpgt isTrue0
isFalse0:
iconst_0
goto end0
isTrue0:
iconst_1
end0:
iload 12
ldc 0
if_icmplt isTrue1
isFalse1:
iconst_0
goto end1
isTrue1:
iconst_1
end1:
ior
istore 15
iload 15
ifeq end3
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "You made a mistake"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto end4
end3:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 9
invokevirtual java/io/PrintStream/println(I)V
end4:
iload 10
iload 12
if_icmpgt isTrue2
isFalse2:
iconst_0
goto end4
isTrue2:
iconst_1
end4:
iload 12
ldc 0
if_icmplt isTrue3
isFalse3:
iconst_0
goto end5
isTrue3:
iconst_1
end5:
iand
istore 15
iload 15
ifeq end7
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "true"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto end8
end7:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "false"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
end8:
return
.end method

