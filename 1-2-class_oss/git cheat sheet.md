GIT BASICS
git init <directory> | 현재 디렉토리 기준으로 저장소 생성
git clone <repo> | 깃허브 원격 저장소를 지역 저장소에 복제 [기본 이름: origin]
git add <directory> | 커밋을 위해 Staging
git commit -m "<message>" | 커밋 메세지와 함께 커밋
git status | staged, unstaged, tracked, untracked 파일을 상태 확인
git log | 커밋 기록을 표시
git diff | 인덱스와 WD를 비교

USER SETTINGS
git config --global user.name "<사용자 이름>" | 사용자 이름 입력
git config --global user.email "<사용자 메일>" | 사용자 메일 입력
git config --ls | 전체 설정 확인
git config <설정 이름> | 부분 설정 확인
git config --global core.autocrlf true | 맥(lf)과 윈도(crlf)간의 자동 변환
git config --global core.safecrlf false | 뉴라인 경고 발생 없애기
git config --global core.editor "code -wait" | 편집기 설정
git config --global init.defaultBranch main | 기본 설정을 main으로 수정

GIT BRANCH
git branch | 저장소에 있는 브랜치 항목을 보여줌
git branch <브랜치 이름> | 브랜치를 생성함
git checkout -b | 브랜치를 생성하고 이동
git switch <브랜치 이름> | 브랜치 이동
git switch -c | 브랜치를 생성하고 이동
git branch -h | 도움말 보기
git cheack out HEAD~ | 전 단계로 이동

GIT STASH
git stash | 임시 저장
git stash list | stash list  보여줌
git stash apply |  가장 최근 임시저장을 WD에 반영
git stash --keep-index | 저장하면서 index
git stash pop | 가장 최근 임시저장 삭제

GIT CLEAN
git clean | untracked 파일 삭제
git clean -f | untracked 파일 강제 삭제
git clean -n | 삭제할 것인지 물어보기
git clean -i | 옵션을 이용해 삭제하기

GIT PUSH PULL
git push | 지금까지 커밋을 원격 저장소에 반영
git pull | 원격 저장소 이력은 지역 저장소에 반영





