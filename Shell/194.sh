awk '{
          for(i = 1 ;i <= NF;++i){
              if(line[i] == "") line[i] = $i
              else line[i] = line[i]" "$i
        }
    }
    END {
        for(i = 1; i <= NF;++i)
            print line[i]
    }
' file.txt
