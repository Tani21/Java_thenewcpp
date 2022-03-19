Given three integers (x, y, and z)

representing the three sides of a triangle, identify whether the triangle is scalene, isosceles, or equilateral.

    If all three sides are equal, output EQUILATERAL.
    Otherwise, if any two sides are equal, output ISOSCELES.
    Otherwise, output SCALENE.


read a
read b
read c

if [[ $a -eq $b ]] && [[ $b -eq $c ]]
then
        echo "EQUILATERAL"


elif [[ $a -ne $b ]] && [[ $b -ne $c ]] && [[ $a -ne $c ]]
then
        echo "SCALENE"

   
else 
    echo "ISOSCELES"
fi
