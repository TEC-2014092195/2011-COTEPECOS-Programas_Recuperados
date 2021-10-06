{Derechos Reservados Kevin Hernandez/10-5/COTEPECOS/2011}
program Proyecto_1_18;
uses crt,dos;
var
        num1,total:real;
        letra:char;
        salir:string;
begin
        clrscr;
        textcolor(green);
        writeln('*****************************************************************************');
        writeln('Programa Nø: 18 ');
        writeln('Descripci¢n: Aplica funciones "Sqr","Sqrt","trunc","Int" ');
        writeln('Elaborado por: Kevin Hernandez Rostran');
        writeln('Fecha: 28/6/2011');
        writeln('*****************************************************************************');
        repeat
        begin
        writeln;
        textcolor(10);
        writeln('LETRAS:  a. para "SQR"  b. para "SQRT"  c. para "TRUNC"  d. para "INT"');
        writeln('');
        textcolor(14);
        write('Digita la letra correspondiente dependiendo del caso que desees: ');
        readln(letra);
        textcolor(7);
        writeln('');
        case letra of
        'a': begin writeln('Digite el numero al que desea calcularle el cuadrado: '); readln(num1); total:= Sqr(num1); writeln; writeln('El cuadrado de ',num1:0:3,' es: ',total:0:3); end;
        'b': begin writeln('Digite el numero al que desea calcularle la raiz: '); readln(num1); total:= Sqrt(num1); writeln; writeln('La raiz de ',num1:0:3,' es: ',total:0:3); end;
        'c': begin writeln('Digite un numero con decimales: '); readln(num1); total:= Trunc(num1); writeln; writeln('El resultado de la funcion Trunc es: ',total:0:3); end;
        'd': begin writeln('Digite un numero con decimales: '); readln(num1); total:= Int(num1); writeln; writeln('El resultado de la funcion Int es: ',total:0:3); end;
        end;
        writeln('');
        write('Digite "si" para salir: ');
        readln(salir);
        end
        until salir = 'si';
end.



