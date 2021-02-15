#!/bin/sh

if [ $# -ne 1 ]
then
  echo "You must pass the file name"
  exit 1
fi

FILE_NAME=$1

for file in `find . -type f -iname $FILE_NAME`
do
  echo "Adding newline at the end of $file"
  sed -i -e '$a\' $file
done
