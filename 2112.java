#Link: https://t-t-h-n-e-w.blogspot.com/2020/10/2112.html

f := 5*a/(b+c)+5*b/(c+a)+5*c/(a+b)-(a^2+b^2+c^2)/(a*b+a*c+b*c)-10;

F := collect(numer(f), a, factor);

P := (2*c-a+2*b)^2*(4*a^2*b+4*a^2*c+10*a*b^2+25*a*b*c+10*a*c^2+18*b^3+75*b^2*c+75*b*c^2+18*c^3)+(-2*c+a-2*b)*(b^2+3*b*c+c^2)*(36*b^2+77*b*c+36*c^2)+2*b*c*(b+c)*(b-c)^2;

factor(F-P);
