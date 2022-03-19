Read in one character from STDIN.
If the character is 'Y' or 'y' display "YES".
If the character is 'N' or 'n' display "NO".
No other character will be provided as input. 

// use the == operator to compare characters

read character

if [[ $character == 'Y' ]]; then
    echo "YES"
elif [[ $character == 'y' ]]; then
    echo "YES"
elif [[ $character == 'N' ]]; then
    echo "NO"
elif [[ $character == 'n' ]]; then
    echo "NO"
fi
