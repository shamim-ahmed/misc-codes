#!/bin/bash

links=`awk 'BEGIN{
RS="</a>"
IGNORECASE=1
}
{
  for(o=1;o<=NF;o++){
    if ( $o ~ /href/){
      gsub(/.*href=\042/,"",$o)
      gsub(/\042.*/,"",$o)
      print $(o)
    }
  }
}' index.html`

for file in `echo $links`
do
  file_name=`basename $file`

  if [[ $file_name == *mp3 ]]; then
    if [ -f $file_name ]; then
      echo "the file $file_name already exists and won't be downloaded again"
    else
      wget $file
    fi
  fi
done

