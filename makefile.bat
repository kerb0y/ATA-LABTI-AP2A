@echo off
setlocal enabledelayedexpansion

rem Loop through files in the current directory
for %%F in (act*.class act*.java LA-ACT*) do (
    rem Extract the number after 'act' or 'ACT'
    set "filename=%%F"
    set "num="
    
    rem Determine if the file starts with 'act' or 'ACT'
    if "!filename:~0,3!"=="act" (
        set "num=!filename:~3,1!"
    ) else (
        set "num=!filename:~4,1!"
    )
    
    rem Check if num is a digit
    if "!num!" geq "0" if "!num!" leq "9" (
        rem Create the folder if it doesn't exist
        if not exist "act!num!" (
            mkdir "act!num!"
        )
        rem Move the file to the corresponding folder
        move "%%F" "act!num!\"
    )
)

echo Files moved successfully!
pause
