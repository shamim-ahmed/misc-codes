#!/bin/sh

TMP_FILE=/tmp/my_content.txt

if [ "$#" -le "0" ]
then
  echo "You must supply at least one file name"
  exit 1
fi

for f in $*
do
  echo "trimming each line of file $f"
  cat $f | sed 's/^[ \t]*//;s/[ \t]*$//' > $TMP_FILE
  cat $TMP_FILE > $f
done
