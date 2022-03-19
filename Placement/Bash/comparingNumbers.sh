Given two integers. Find if the first number is greater, equal or smaller than the second

read x
read y

minus=$((x-y))

if [[ minus -gt 0 ]]; then
    echo "X is greater than Y"
elif [[ minus -eq 0 ]]; then
    echo "X is equal to Y"
else
    echo "X is less than Y"
fi

