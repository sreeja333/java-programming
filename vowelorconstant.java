class vowelorconstant {
public static void main(String[] args) {
char cha = 'z';
switch (cha) {
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(cha + " Vowel ");
break;
default:
System.out.println(cha + " Consonant ");
}
}
}
