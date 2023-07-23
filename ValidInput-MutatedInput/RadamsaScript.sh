
# INPUT_FILE="input.txt"
# OUTPUT_FILE="output.txt"

# # Iterate over each line in the input file
# while IFS= read -r line
# do
#     # Apply Radamsa to mutate the line using the specified operator
#     mutated_output=$(echo "$line" | radamsa --verbose)

#     # Extract the seed number from the Radamsa output
#     seed=$(echo "$mutated_output" | awk '/Random seed:/ {print $NF}')

#     line_output="$mutated_output $seed"

#     # Append the mutated line to the output file
#     echo "$line_output" >> "$OUTPUT_FILE"

    
# done < "$INPUT_FILE"

#set -x  # Enable debugging output


#!/bin/bash

INPUT_FILE="input.txt"
OUTPUT_FILE="output.txt"

index=1

# Iterate over each line in the input file
while IFS= read -r line
do
    # Apply Radamsa to mutate the line using the specified operator
    # v allows to see the seed number; n stands for the number of changes in the input line. 

    if ((index<=10));then
        mutated_output=$(echo "$line" | radamsa --verbose -n 1 -s 744396417663034837922748)

    elif((index>10 && index<=20));then
        mutated_output=$(echo "$line" | radamsa --verbose -n 1 -s 69348931124107475093826)

    elif((index>20 && index<=30));then
        mutated_output=$(echo "$line" | radamsa --verbose -n 1 -s 547403933973214057192552)

    elif((index>30 && index<=40));then
        mutated_output=$(echo "$line" | radamsa --verbose -n 1 -s 596921270827007302646900)

    else
        mutated_output=$(echo "$line" | radamsa --verbose -n 1 -s 841147025370214944587873)
    fi

    # Append the mutated line with the seed number to the output file
    echo "$mutated_output" >> "$OUTPUT_FILE"
    # Increment the index counter
    ((index++))
done < "$INPUT_FILE"
