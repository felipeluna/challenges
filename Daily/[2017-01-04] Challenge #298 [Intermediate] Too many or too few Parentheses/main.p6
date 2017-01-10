my @lines = 'input.txt'.IO.lines;

my @stack;
for @lines -> $line {
  for $line.comb.kv -> $i, $v {
    if $v eq '(' {
      @stack.push(($i, $v));
    } elsif $v eq ')' {
      if @stack.elems > 0 {
        if @stack[*-1][1] eq '(' {
          @stack.pop();
        }
      } else {
        @stack.push(($i, $v));
        last;
      }
    }
  }
  if @stack.elems > 0 {
    my $val = @stack[*-1][0];
    my $n = $line;
    substr-rw($n, $val, 0) = '*';
    substr-rw($n, $val+2, 0) = '*';
    say "$n\n";
  }else{
    say "$line\n"; 
  }
  @stack = [];
}

