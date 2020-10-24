#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )/src/introduction"
kotlinc "$DIR"/utils.kt -cp -include-runtime -d utils.jar
echo YES
declare -A tests
tests["1"]="the quick brown fox jumps over the lazy dog:the\nquick\nbrown\nfox\njumps\nover\nthe\nlazy\ndog"
tests["2"]="the quick brown fox jumps over the lazy dog:brown\ndog\nfox\njumps\nlazy\nover\nquick\nthe\nthe"
tests["3"]="the quick brown fox jumps over the lazy dog:brown\ndog\nfox\njumps\nlazy\nover\nquick\nthe"
tests["4"]="the quick brown fox jumps over the lazy dog:brown 1\ndog 1\nfox 1\njumps 1\nlazy 1\nover 1\nquick 1\nthe 2"
tests["5"]="the quick brown fox jumps over the lazy dog:the 2\nbrown 1\ndog 1\nfox 1\njumps 1\nlazy 1\nover 1\nquick 1"
tests["6"]="the quick brown fox jumps over the lazy dog:brown\ndog\nfox\njumps\nlazy\nover\nquick\nthe\nthe"
for fileName in "${!tests[@]}"
do
  IFS=':'; testArgs=(${tests[$fileName]}); unset IFS;
  echo "Programs testing $fileName"
  echo "Response:"
  ./RUN.sh "$fileName" "$DIR" "${testArgs[0]}"
  echo "Correct response:"
  echo -e "${testArgs[1]}"
done
exec $SHELL