Your task is to use for loops to display only odd natural numbers from 1 to 99.

a=2

for i in {1..99}
do
    c=$((i%2)) 
    if [[ $c -ne 0 ]]; then
        echo $i
    fi

done
