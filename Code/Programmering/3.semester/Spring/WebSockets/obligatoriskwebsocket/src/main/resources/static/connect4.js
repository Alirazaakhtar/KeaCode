class Connect4 {
    constructor(selector) {
        this.ROWS = 6;
        this.COLS = 7;
        this.player  = 'red';
        this.selector = selector;
        this.createGrid();
        this.setupEventListeners();
    }

    createGrid(){
        const $board = $(this.selector);
        for (let row = 0; row < this.ROWS; row++){
            const $row = $('<div id="row">')
                .addClass('row');
            for (let col = 0; col < this.COLS; col++){
                const $col = $('<div>')
                    .addClass('col empty')
                    .attr('data-col', col)
                    .attr('data-row', row);

                $row.append($col);

                $("data")
        }
            $board.append($row);
        }
    }


    // function setupBoard(){
    //     var count = 0;     for (let col = 0; col < numberOfColumns ; col++) {
    //         // important: Use let if variable is given to callback 
    //     for (let j = 1; j <= numberOfRows ; j++) {
    //         addDiv($("#col" + col), count)
    //         count++;
    //         }         // add clickhandler 
    //         $("#col" + col).click(function (e){ 
    //             sendMove(col) 
    //         }) 
    //     } } 
    //     }
    // }

    setupEventListeners(){
        const $board = $(this.selector);
        const that = this;

        function findLastEmptyCell(col){
            const cells = $(`.col[data-col ='${col}']`);
            for (let i = cells.length -1; i>=0; i--){
                const  $cell = $(cells[i]);
                if ($cell.hasClass('empty')){
                    return $cell;
                }
            }
            return null;
        }

        $board.on('mouseenter', '.col.empty', function(){

            const col = $(this).data('col');
            const $lastEmptyCell = findLastEmptyCell(col);
            $lastEmptyCell.addClass(`next-${that.player}`);
        });

        $board.on("mouseleave", ".col", function () {
            $(".col").removeClass(`next-${that.player}`);
        });

        $board.on('click', '.col.empty', function () {
            const col = $(this).data('col');
            const row = $(this).data('row');
            console.log("Hello wolrd" + col + " and " + row);
            const $lastEmptyCell = findLastEmptyCell(col);
            $lastEmptyCell.removeClass('empty');
            $lastEmptyCell.addClass(that.player);
            that.player = (that.player === 'red') ? 'black' : 'red';

        });
    }

}