import React, { useState } from 'react';
import useGithub from '../../hooks/githubHooks';

import * as S from './styled';

function Header() {
  const { getUser } = useGithub();

  const [usernameForSearch, setUsernameForSeach] = useState();

  const submitGetUser = () => {
    if (!usernameForSearch) return;
    return getUser(usernameForSearch);
  };

  return (
    <S.Wrapper>
      <input
        type="text"
        placeholder="Buscar Usuario"
        onChange={(event) => setUsernameForSeach(event.target.value)}
      />
      <button type="submit" onClick={submitGetUser}>
        <span>Buscar</span>
      </button>
    </S.Wrapper>
  );
}

export default Header;
