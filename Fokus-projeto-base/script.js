const html = document.querySelector('html')
const focoBT = document.querySelector('.app__card-button--foco')
const curtoBT = document.querySelector('.app__card-button--curto')
const longoBT = document.querySelector('.app__card-button--longo')
const banner = document.querySelector('.app__image')

focoBT.addEventListener('click', () =>{
    html.setAttribute('data-contexto' , 'foco')
    banner.setAttribute('src','./imagens/foco.png')
})

curtoBT.addEventListener('click', () =>{
    html.setAttribute('data-contexto' , 'descanso-curto')
    banner.setAttribute('src','./imagens/descanso-curto.png')
})

longoBT.addEventListener('click', () =>{
    html.setAttribute('data-contexto' , 'descanso-longo')
    banner.setAttribute('src','./imagens/descanso-longo.png')
})