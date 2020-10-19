#!/bin/bash
if [ -n "$1" ]
	then
      kotlinc "$1".kt -cp utils.jar -include-runtime -d "$1".jar
	else
		echo 'Expected kotlin file name'
fi